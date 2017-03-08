all:
	Asl prova.asl -ast prova.dot -dot -noexec
	dot -Tpdf -o prova.pdf prova.dot

exec:
	Asl prova.asl -trace prova.trace

clean:
	rm prova.dot prova.pdf prova.trace