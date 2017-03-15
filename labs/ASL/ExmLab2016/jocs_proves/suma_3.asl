func main()
  x = 4;  
  y = 5;
  write "The sum is ";
  write sum(x, y);  write "%n";
 
  z = sum(2*x,10);
  write "The second sum is ";
  write sum(x, y+2, z);  write "%n";

  t = 14;
  write "Yet another: "; 
  write sum(x, y, z, t+sum(1,2,3) );  write "%n"
endfunc
