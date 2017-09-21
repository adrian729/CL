func f(&v)
  v = 0;
  return 0;
endfunc

func main()
  x = 1; y = 3;
  k = 0;
  foreach a in [x, y-1, f(x)*y, 14] do
    k = a-k;
    x = x+1
  endfor;
  write k;      // escriu "15"
  write "%n";
  write a+x;    // escriu 14+4  // escriu "18"
  write "%n"
endfunc
