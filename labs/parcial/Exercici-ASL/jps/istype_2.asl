// suma els valors enters de tots les subseqüències seguides de true
// i salta (i no suma) aquells que estan en subseqüències seguides de false
func main()
  s = 0;
  foreach v in {true, 34+1, 12, 9, false, 23, true, 19*2, 17} do
     if not isint(v) then
        filter = v
     else
        if filter then s = s+v endif
     endif
  endfor;
  write s; write "%n";    // s = 35+12+9+38+17    // escriu "111"
  write isint(s) and not isbool(s); write "%n";   // escriu "true"
  write not isint(s) or isbool(s); write "%n"     // escriu "false"
endfunc
