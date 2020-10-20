sentence = str(input())
my_List = sentence.split()
sets = set(my_List)
if(len(sets)==len(my_List)):
	print("yes")
else:
	print("no")