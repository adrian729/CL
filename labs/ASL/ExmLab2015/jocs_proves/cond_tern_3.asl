
func main()
  a = 5;
  write (1 < 2 ? (3 > 4 ? a+5 : ((6 < 7 ? 8+1 : 9*b) * 2)) : (10 > c+11 ? 12 : d*13));
  write "%n";                     // escriu "18"
  write 1 < 2 ?
                3 > 4 ?
                        a+5 :
                        ( 6 < 7 ?
                                  8+1 :
                                  9*b
                                        ) * 2 :
                10 > c+11 ?
                        12 :
                        d*13;
  write "%n";                     // escriu "18"
endfunc
