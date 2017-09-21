func main()
  a = 34;
  s = 0;
  foreach a in {2+1, a, a*2} do
     s = s+a;
     a = a-1;
  endfor;
  write a; write "%n";     // escriu "67"
  write s; write "%n"      // escriu "105"
endfunc
