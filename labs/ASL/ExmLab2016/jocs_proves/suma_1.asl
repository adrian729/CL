func main()
  write "The sum of nothing is ";
  write sum();
  write "%n";

  x = 4;  
  write "The sum of 4 and 5 is ";
  write sum(x, 5);
  write "%n";

  write "The sum of 4, 5, and 6 is ";
  write sum(x, 5, x+2); 
  write "%n";
endfunc
