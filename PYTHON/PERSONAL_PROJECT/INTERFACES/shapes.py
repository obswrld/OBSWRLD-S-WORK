import math

from typing import Protocol

class Shape(Protocol):
    def  area(self) -> float:

        ...

class Rectangle(Shape):
    def __init__(self, width: float, height: float):
        self.width = width
        self.height = height

    def area(self) -> float:
        return self.width * self.height

class Circle(Shape):
    def __init__(self, radius: float):
        self.radius = radius

    def area(self) -> float:
        return self.radius ** 2 * math.pi


def print_shapes(shapes: Shape) -> None:
    print(f"Shapes: {shapes.area()}")

rectangles = Rectangle(width=13, height=14)
circles = Circle(radius=5)

print_shapes(rectangles)
print_shapes(circles)