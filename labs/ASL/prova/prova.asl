func main()	
	X[10] = true;
	write "X "; write X; write "%n";
	X[1] = 3;
	write "X "; write X; write "%n";
	X[8] = 3;
	write "X "; write X; write "%n";
	X[3] = 12;
	write "X "; write X; write "%n";
	Y = X[8] + X[3];
	write "Y = X[8] + X[3] = "; write Y; write "%n";
	write "X "; write X; write "%n"
endfunc

func temp()
	write "X[2] = "; read X[2];
	write "X[2] "; write X[2]; write "%n";
	write "X "; write X; write "%n";
	write "X[8] = "; read X[8];
	write "X[8] "; write X[8]; write "%n";
	write "X[0] "; write X[0]; write "%n";
	Y = X[8] + 3;
	write "Y = X[8] + 3 = "; write Y; write "%n"
endfunc
