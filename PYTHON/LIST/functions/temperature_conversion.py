def get_temperature_conversion(fahrenheit, celsius):
    fahrenheit = (9 / 5) * celsius + 32
    return fahrenheit

for fahrenheit in range(0, 100):
    print("\nFahrenheit: ", fahrenheit)
    temperature = get_temperature_conversion(fahrenheit, 1)
    print("Temperature: ", temperature)
