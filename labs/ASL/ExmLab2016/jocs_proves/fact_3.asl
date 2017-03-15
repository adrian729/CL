func main()
  x = 3;
  z = 1 + 2*(9-x!)!!;
  write "la formula 1 + 2*(9-3!)!! dona: ";
  write z; write "%n";

  n=0;
  while n<3 do
    z = n!!!;
    write "El requetefactorial de "; write n; write " es "; 
    write z;  write "%n";    
    n = n+1;
  endwhile
endfunc