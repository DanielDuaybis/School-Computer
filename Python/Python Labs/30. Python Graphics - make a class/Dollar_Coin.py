#Lab 30
from graphics import *
class DollarCoin:
    coincolor = color_rgb(255,241,33)
    def _init_(self,point):
        self.point = point
        self.coin = Circle(point,50)
        self.coin.setFill(coincolor)
        self.value = Text(point,'$1')
        self.value.setFill('black')
    def draw(self,canvas):
        self.coin.draw(canvas)
        self.value.draw(canvas)
