import unittest

from MOVIE.src.movie.movie_rating import Movie
from movie.movie_rating import set_rating

class TestMovies(unittest.TestCase):
    my_movie = Movie()

    def __init__(self, methodName: str = "runTest"):
        super().__init__(methodName)
        self.movie_list = None

    def test_add_movies(self):
        self.my_movie.add_movies("Black")
        self.my_movie.add_movies("White")
        self.assertEqual(len(self.my_movie.movie_list), 2)

    def test_get_movie(self):

        self.my_movie.add_movies("White")
        self.my_movie.add_movies("Black")

        self.assertEqual(len(self.my_movie.get_movies()), 2)
        movie = self.my_movie.get_movie("Black")
        # set_rating("Black", 4)
        self.assertEqual("black", movie )

    def test_set_rating(self):
        self.my_movie.add_movies("White")
        self.my_movie.add_movies("Black")
        self.assertEqual(len(self.my_movie.movie_list), 2)
        self.assertEqual(set_rating("Black", 4, self.movie_list),2)











