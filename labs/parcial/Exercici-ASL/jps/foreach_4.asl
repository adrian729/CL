func main()
  b = 34;
  foreach a in [2+1, b, b>2] do   // no tenen el mateix tipus
     write a;
     write "%n";
     b = b + a
  endfor;
  write b; write "%n"
endfunc
