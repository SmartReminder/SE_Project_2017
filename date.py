#date = [[[ [] for x in range(7)]for y in range(12)]for z in range(200)]
#print (date)
#date day month year

def findAmountOfDay(month,yearCount):
    if month == 1:
        return 31
    elif month == 2:
        if yearCount == 4:
            return 29
        else:
            return 28
    elif month == 3:
        return 31
    elif month == 4:
        return 30
    elif month == 5:
        return 31
    elif month == 6:
        return 30
    elif month == 7:
        return 31
    elif month == 8:
        return 31
    elif month == 9:
        return 30
    elif month == 10:
        return 31
    elif month == 11:
        return 30
    elif month == 12:
        return 31
    else:
        return 0

yearCount = 1

#Tue,1,JAN,1901
cal = [3,1,1,1901]
point = [31,12,2099]
while(True):
    if cal[1:] == point:
        break
    else:
        if cal[1] == findAmountOfDay(cal[2],yearCount):
            cal[1] = 1
            if cal[2] < 12:
                cal[2] = cal[2] + 1
            else:
                cal[2] = 1
                cal[3] = cal[3] + 1
                if yearCount < 4:
                    yearCount = yearCount + 1
                else:
                    yearCount = 1
        else:
            cal[1] = cal[1] + 1
    
        if cal[0] < 7:    
            cal[0] = cal[0] + 1
        else:
            cal[0] = 1

        #print (cal)

print (cal)
