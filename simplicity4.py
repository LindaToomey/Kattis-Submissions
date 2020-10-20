stringInput = input()

#This sorts the string alphabetically
sorted_characters = sorted(stringInput)
stringInput = "".join(sorted_characters)

#This counts unique letters
unique = list(set(stringInput))
newWord = ""
second = ""

newWord = newWord.join(unique)

sorted_characters = sorted(stringInput)
second = "".join(sorted_characters)

if(len(unique)==2 or len(unique)==1):
	print("0")

elif(len(unique)==len(stringInput)):
	print(-2+len(unique))
else:
	my_list = []
	for i in range(len(newWord)):
		ans = second.count(newWord[i])
		#print(ans)
		my_list.append(ans)
		temp = my_list[i]
	
	my_list.sort(reverse=False)

	output2 = 0;
	output = len(stringInput)
	for i in range(len(newWord)-2):
		output2+=(int(my_list[i]))
		output-=(int(my_list[i]))

	print(output2)

