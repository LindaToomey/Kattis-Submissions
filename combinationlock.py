import sys
import math

userInput = str(input())
while(userInput!="0 0 0 0"):
	#my_List = []
	my_List = userInput.split(' ')
	num1 = int(my_List[0])
	num2 = int(my_List[1])
	num3 = int(my_List[2])
	num4 = int(my_List[3])


	totalDegrees = int(1080)

	if(num2>num1):
		num1 = num1 + 40
	totalDegrees = ((num1-num2)*9) + totalDegrees
	if(num2>num3):
		num2 = num2 -40
	totalDegrees = ((num3 - num2)*9) + totalDegrees
	if(num4>num3):
		num3 = num3 + 40
	totalDegrees = ((num3-num4)*9) + totalDegrees

	print(totalDegrees)
	userInput = str(input())







