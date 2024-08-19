# from WasRun import WasRun

# test = WasRun("testMethod")
# print(test.wasRun)
# test.testMethod()
# print(test.wasRun)



from WasRun import TestCase, WasRun


class TestCaseTest(TestCase):
    def setUp(self):
        self.test = WasRun("testMethod")
   
    def testTemplateMethod(self):
        test = WasRun("testMethod")
        self.test.run()
        assert("setUp testMethod " == test.log)
    
    
# TestCaseTest("testRunning").run()
TestCaseTest("testSetUp").run()