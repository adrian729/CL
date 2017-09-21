func main()
  x = 1; y = 3;
  s = 0;
  foreach a in {x, y-1, x*y, 14} do
    s = s+a;
  endfor;
  write s;      // escriu "20"
  write "%n"
endfunc
