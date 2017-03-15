func main()
  x = 2;  
  y = 1;
  write "The sum is ";
  write sum(x, y, x*y-1);  write "%n";
 
  z = sum(2*x,10);
  write "The second sum is ";
  write sum(x, y+2, z>0 or y<2);  write "%n";

  write "Yet another: "; 
  write sum(x, y, -z-x-y, z);  write "%n";
endfunc