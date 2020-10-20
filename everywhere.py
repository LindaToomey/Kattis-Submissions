testCases = int(input())

while(testCases>0):
	num = int(input())

	places = []

	for i in range(num):
		places.append(input())

	placeSet = set(places)

	print(len(placeSet))
	testCases = testCases-1

