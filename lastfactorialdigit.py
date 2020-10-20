factorial = [1]
for i in range(1,11):
	factorial.append(factorial[i-1] * i)

cases = input()
for i in range(int(cases)):
	n = input()
	n = int(n)
	output = (factorial[n])
	stroutput = str(output)
	#print("output=")
	#print(stroutput)
	x = (len(stroutput))
	print(stroutput[x-1])