
from WasRun import TestCase, WasRun


class TestCaseTest(TestCase):
   
    def testTemplateMethod(self):
        test = WasRun("testMethod")
        test.run()
        assert("setUp testMethod tearDown" == test.log)
    
    
# TestCaseTest("testRunning").run()
TestCaseTest("testTemplateMethod").run()