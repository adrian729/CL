func main()
  s = 0;
  i = 0;
  while i < 5 do
    if i%2 = 0 then  n = i
    else             n = false
    endif;
    i = i+1;
    if isint(n) then s = s + n*n
    else
      if isbool(n) then s = s/2 endif
    endif
  endwhile;
  write s; write "%n"    // escriu "18"
endfunc
