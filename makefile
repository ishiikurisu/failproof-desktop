sourcefiles = src/br/eng/crisjr/failproof/desktop/model/MainModel.java src/br/eng/crisjr/failproof/desktop/view/MainView.java src/br/eng/crisjr/failproof/desktop/controller/MainController.java src/br/eng/crisjr/failproof/desktop/Main.java
mainclass = br.eng.crisjr.failproof.desktop.Main

compile6:
	javac -target 1.6 -source 1.6 $(sourcefiles)

compile:
	javac $(sourcefiles)

run: compile
	java -cp src $(mainclass)

build: compile
