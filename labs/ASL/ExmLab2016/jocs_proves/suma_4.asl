func main()
  x = 2;  
  y = 4;
  write "Result is ";
  write sum(x,y)! - sum(x!!,y!);  write "%n";
 
  z = sum(2*x,sum(x+y!));
  write "Second result is ";
  write (sum(z)/15*3!)!;  write "%n";
endfunc