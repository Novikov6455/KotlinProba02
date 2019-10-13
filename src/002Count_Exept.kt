/* Count  accumulator except example */

fun main(parameter: Array <String>) {
	var count = 0
	var total = 0.0
	var average = 0.0
	var inpDig = 0.0
while (true){
	print("Enter NUMBER or 'Done' for exit: ")
	val inp = readLine()
	if (inp == "Done")  {print("Done"); break}

	try {
		inpDig = inp!!.toDouble()
		total += inpDig
		count += 1
		average = total/count
	}catch (e:Exception){
		print("Enter invalid, try more time\n"); continue
	}
println("Total= $total, Count= $count, Average= $average")
}}
