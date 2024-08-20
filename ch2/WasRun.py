
class TestCase:
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def tearDown():
        pass

    def run(self):
        self.setUp()
        method = getattr(self, self.name)
        method()
        self.tearDown()



class WasRun(TestCase):

    def testMethod(self):
        self.wasRun = 1
        self.log = self.log + "testMethod "

    def setup(self):
        self.wasRun = None
        self.wasSetUp = 1
        self.log = "setUp "
    
    def tearDown(self):
        self.log = self.log + "tearDown "