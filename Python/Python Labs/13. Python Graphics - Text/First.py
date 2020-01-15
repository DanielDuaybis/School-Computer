#Lab 13
from graphics import *
window = GraphWin('window',1000,1000)
cym = Text(Point(500,500),"POSITIVITY")
cym.setSize(36)
cym.setStyle('bold italic')
cym.setFill('cyan')
cym.draw(window)
time.sleep(.6)
for x in range(0,10000000):
    if(int(x)%3 == 0):
        cym.setText('IS')
        cym.setFill('red')
        time.sleep(.6)
    if(int(x)%3 == 1):
        cym.setText('AMAZING')
        cym.setFill('yellow')
        time.sleep(.6)
    if(int(x)%3 == 2):
        cym.setText('POSITIVITY')
        cym.setFill('cyan')
        time.sleep(.6)
