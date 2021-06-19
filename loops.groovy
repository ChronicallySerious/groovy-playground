String text = 'Hello World'

for (int i = 0; i < 3; i++)
{
	println(text + " " + "$i");
}

println('----')

for (i in 0..2) { println(text + " " + "$i"); }

println('----')

0.upto(2) { println(text + " $it") }

println('----')

3.times() { println(text + " $it") }

println('----')

0.step(3, 1) { println(text + " $it") }
