class TimeWithProperties:
    def __init__(self, second=0, minute=1, hour=1):
        self.second = second
        self.minute = minute
        self.hour = hour

    @property
    def second(self):
        return self._second

    @second.setter
    def second(self, value):
        if value < 0 or value > 59:
            raise ValueError("value must be between 0 and 59")
        self._second = value

    @property
    def minute(self):
        return self._minute

    @minute.setter
    def minute(self, value):
        if value < 1 or value > 59:
            raise ValueError("value must be between 1 and 59")
        self._minute = value

    @property
    def hour(self):
        return self._hour

    @hour.setter
    def hour(self, value):
        if value < 0 or value > 23:
            raise ValueError("value must be between 0 and 23")
        self._hour = value

    def __str__(self):
        return f"Time({self.hour:02} : {self.minute:02} : {self.second:02})"


TimeWithProperties1 = TimeWithProperties()
TimeWithProperties1.second = 12
TimeWithProperties1.minute = 6
TimeWithProperties1.hour = 3
print(TimeWithProperties1)

TimeWithProperties2 = TimeWithProperties()
TimeWithProperties2.minute = 45
print(TimeWithProperties2)

TimeWithProperties3 = TimeWithProperties()
TimeWithProperties3.hour = 20
print(TimeWithProperties3)

