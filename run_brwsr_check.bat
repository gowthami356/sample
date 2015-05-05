@echo [INFO]
call mvn clean install -Pdev_brwsr_check
@echo [INFO]
@echo [INFO] Check more detailed results under: \aaa-testng-tests\target\test-output\html\index.html
@echo [INFO]
pause
