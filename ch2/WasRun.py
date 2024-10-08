
class TestCase:
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def tearDown():
        pass

    def run(self):
        result = TestResult()
        result.testStarted()

        self.setUp()
        method = getattr(self, self.name)
        method()
        self.tearDown()
        return result


class TestResult:
    def __init__(self):
        self.runCount = 0
    
    def testStarted(self):
        self.runCount = self.runCount + 1
    
    def summary(self):
        return "%d run, 0 failed" % self.runCount


class WasRun(TestCase):

    def testMethod(self):
        self.log = self.log + "testMethod "

    def setup(self):
        self.log = "setUp "
    
    def tearDown(self):
        self.log = self.log + "tearDown "

    def testBrokenMethod(self):
        raise Exception