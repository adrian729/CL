#! /bin/bash

###############################################3
#
#  Examen parcial de CL 
# 
#  Script de verificacio de jocs de proves 
#
#  Us:  ./avalua.sh
#
#  Executa els jocs de proves dels directoris
#  ./Exercici-ANTLR/jps
#  ./Exercici-ASL/jps
#
#  Per al primer exercici, usa el codi que es trobi
# a Exercici-ANTLR/Dot.g
#  Per al segon exercici, usa el codi que es trobi
# a Exercici-ASL/Asl
#
#  El resultat de l'script es una llista de quins 
# jocs de proves se superen i quins no
#
#  Els resultats d'aquest script son orientatius, 
# i no suposen cap compromís respecte a la qualificacio 
# final de l'examen.
#
###############################################3

BASEDIR=$(readlink -f `dirname $0`)

export ANTLR3=$BASEDIR/antlr3
export CLASSPATH=$ANTLR3/antlr-3.4-complete.jar:$ANTLR3/antlrworks-1.4.3.jar
export PATH=$PATH:$ANTLR3

EX1DIR=`readlink -f $BASEDIR/Exercici-ANTLR`

#--- Exercici ANTLR --------------------------------

pushd $EX1DIR &> /dev/null
make clean
make

# executar gramatica sobre els jps
rm -f jps/*.student.*

echo "==============================="
echo ""
echo "     Exercici ANTLR"
echo ""
echo "==============================="
echo -e "     \tAST\toutput"
echo "-------------------------------"
for jp in jps/*.dot; do
    f=`basename $jp .dot`
    $EX1DIR/executa $jp >& jps/$f.student.out

    # compare produced AST with expected AST
    if ( diff -q -s jps/$f.ok.ast jps/$f.student.ast &>/dev/null ); then ast="OK"
    else ast="NO"; fi

    # compare produced output with expected output
    if ( ! test -f jps/$f.ok.out || ! test -s jps/$f.ok.out); then out="-"
    elif ( diff -q -s jps/$f.ok.out jps/$f.student.out &>/dev/null ); then out="OK"
    else out="NO"; fi
   
    echo -e "$f:\t$ast\t$out"
done
echo "==============================="

popd &> /dev/null

#--- Exercici ASL --------------------------------

EX2DIR=`readlink -f $BASEDIR/Exercici-ASL`
ASLDIR=$EX2DIR/Asl

#--- Exercici ASL
# build interpreter
pushd $ASLDIR &> /dev/null
make clean
make compile exec
popd &> /dev/null

# run compiler to evaluate on existing test suites
pushd $EX2DIR &> /dev/null

# executar gramatica sobre els jps
rm -f jps/*.student.*

echo "==============================="
echo ""
echo "     Exercici ASL"
echo ""
echo "==============================="
echo -e "     \t\tAST\tOutput"
echo "-------------------------------"
for jp in jps/*.asl; do
    f=`basename $jp .asl`
    d=`dirname $jp`

    # exectute test suite
    $ASLDIR/bin/Asl $jp -ast $d/$f.student.ast < $d/$f.in >& $d/$f.student.out

    # compare produced AST with expected AST
    if ( diff -q -s $d/$f.ok.ast $d/$f.student.ast &>/dev/null ); then ast="OK"
    else ast="NO"
    fi

    # compare produced output with expected output
    if ( ! test -f jps/$f.ok.out || ! test -s jps/$f.ok.out); then out="-"
    elif ( diff -q -s $d/$f.ok.out $d/$f.student.out &>/dev/null ); then out="OK"
    else out="NO"
    fi
   
    echo -e "$f:\t$ast\t$out"
done
echo "==============================="

popd &> /dev/null
