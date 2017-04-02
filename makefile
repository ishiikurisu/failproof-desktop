sourcefiles = src/br/eng/crisjr/failproof/desktop/model/MainModel.java src/br/eng/crisjr/failproof/desktop/view/MainView.java src/br/eng/crisjr/failproof/desktop/controller/MainController.java src/br/eng/crisjr/failproof/desktop/Main.java src/br/eng/crisjr/failproof/desktop/Search.java src/br/eng/crisjr/failproof/desktop/controller/SearchController.java src/br/eng/crisjr/failproof/desktop/view/SearchView.java src/br/eng/crisjr/failproof/desktop/model/Downloader.java src/br/eng/crisjr/failproof/desktop/model/DownloadBox.java
mainclass = br.eng.crisjr.failproof.desktop.Main
api = -cp libs/br.crisjr.eng.failproof.jar

run: compile
	java -cp ./libs/br.eng.crisjr.failproof.jar:./src $(mainclass)

compile6:
	javac -target 1.6 -source 1.6 $(api) $(sourcefiles)

compile:
	javac  $(sourcefiles) -cp ./libs/br.eng.crisjr.failproof.jar:.

build: compile
