def decorator(func):
    def wrapper(*args, **kwargs):
        print("*" * 10)
        result = func(*args, **kwargs)
        print("*" * 10)
        return result
    return wrapper

@decorator
def display_name(name):
    print(name)

display_name("word")
