#Create an array called fact and fill in one value of 1
fact = [1]

#from 1 to 1,10001 multiply the value in fact with the value in fact -1 and add it to fact
#basically creating a table of all catalan values that we can reference later
for i in range(1,10001):
    fact.append(fact[i-1] * i)

#Get user input of how many cases in the form of an int
cases = int(input())
#loop through the amount of cases there will be and keep getting users input
for i in range(cases):
    n = int(input())
    #Depending on n print the relevent array value from fact
    print(fact[2*n] // (fact[n+1]*fact[n]))