func main()
	write "Enter ther order of the Fibonacci number: ";
	read n;
	write "Iterative or recursive algorithm (0 or 1)? ";
	read alg;
	X = true;
	a = fib_loop(X, n, alg);
	write "a: "; write a; write "%n";
	write "RES: "; write X; write "%n"
endfunc


func fib_loop(&res, n, alg)
	i = 2;
	while i < n do
		write i; write "%n";
		res[i-2] = i;
		write res; write "%n";
		i = i + 1;
	endwhile;
	write "Array "; write res; write "%n";
	s = res.size;
	write "Size "; write s; write "%n";

	i = 0;
	while i < s do
		write "i "; write i; write "%n";
		if alg = 0  then fib = fib_iter(res[i])
					else fib = fib_rec(res[i])
		endif;
		write "Fibonacci("; write res[i]; write ")="; write fib; write "%n";
		res[i] = fib;
		i = i + 1
	endwhile;
	return res[res.size - 1]
endfunc

func fib_iter(n)
	i = 1;
	f_i = 1; f_i1 = 1;
	while i < n do
		f = f_i + f_i1;
		f_i1 = f_i;
		f_i = f;
		i = i+1
	endwhile;
	return f
endfunc

func fib_rec(n)
	if n <= 1   then return 1
				else return fib_rec(n-1) + fib_rec(n-2)
	endif
endfunc
