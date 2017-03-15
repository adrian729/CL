func main()
  x, y, z = 5, 10, 15;
  write "x1: "; write x; write "%n";
  write "y1: "; write y; write "%n";
  write "z1: "; write z; write "%n";

  x, y, z = z, x, y;
  write "x2: "; write x; write "%n";
  write "y2: "; write y; write "%n";
  write "z2: "; write z; write "%n";

  x, y, z = z+x, x+y, y+z;
  write "x3: "; write x; write "%n";
  write "y3: "; write y; write "%n";
  write "z3: "; write z; write "%n";
endfunc
