#Lab 15
from graphics import *
window = GraphWin('window',1000,1000)
entry = Entry(Point(500,500),100)
entry.draw(window)
window.getMouse()
entry.undraw()
message = Text(Point(500,475),entry.getText())
message.setSize(36)
message.setStyle("bold italic")
message.setTextColor('cyan')
message.draw(window)
