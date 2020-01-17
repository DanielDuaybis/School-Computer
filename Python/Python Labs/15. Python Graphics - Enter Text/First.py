#Lab 15
from graphics import *
tex = input("What message would you like to send? ")
window = GraphWin('window',1000,1000)
message = Text(Point(500,475),tex)
message.setSize(36)
message.setStyle("bold italic")
message.setTextColor('cyan')
message.draw(window)
