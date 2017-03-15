
func ok()
  write "correct write%n";
  return 1;
endfunc

func error()
  write "erroneous write%n";
  return 2;
endfunc

func main()
  a = 5;
  write 1 > a+3 ? error() : ok() + a;      // escriu "correct write\n6"
  write "%n";
  write 1 < a+3 ? ok() : error() + a;      // escriu "correct write\n1"
  write "%n";
  write a+3 ? ok() : error + a;            // runtime error
endfunc
