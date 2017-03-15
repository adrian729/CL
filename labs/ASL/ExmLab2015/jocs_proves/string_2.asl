
func append(&s1, s2)
  s1 = s1 + s2
endfunc

func concat(s1, s2)
  s1 = s1 + s2;
  return s1;
endfunc

func main()
  s_nou = "abc";
  append(s_nou, " def");
  write s_nou;                     // escriu "abc def"                    
  write "%n";
  write concat(s_nou, " ghi");     // escriu "abc def ghi"
  write "%n";
  write s_nou;                     // escriu "abc def"
  write "%n";
  write s_nou + 33;                // runtime error
endfunc
