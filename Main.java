package Software_Design_Patterns.Assignment_3;

public class Main {
    public static void main(String[] args) {
        programLanguage python = new PythonLibraryAdapter(new PythonLibrary());
        programLanguage java = new JavaLibraryAdapter(new JavaLibrary());
        python.doSomething();
        java.doSomething();
    }

    interface programLanguage {
        void doSomething();
    }
    static class PythonLibrary {
        public void printHelloWorld() {
            System.out.println("print(\"Hello World\")");
        }
    }

    static class JavaLibrary {
        public void bringOutHelloWorld() {
            System.out.println("System.out.println(\"Hello World\")");
        }
    }

    static class PythonLibraryAdapter implements programLanguage {
        private PythonLibrary pythonLibrary;

        public PythonLibraryAdapter(PythonLibrary pythonLibrary) {
            this.pythonLibrary = pythonLibrary;
        }
        @Override
        public void doSomething() {
            pythonLibrary.printHelloWorld();
        }
    }

    static class JavaLibraryAdapter implements programLanguage {
        private JavaLibrary javaLibrary;

        public JavaLibraryAdapter(JavaLibrary javaLibrary) {
            this.javaLibrary = javaLibrary;
        }
        @Override
        public void doSomething() {
            javaLibrary.bringOutHelloWorld();
        }
    }
}
