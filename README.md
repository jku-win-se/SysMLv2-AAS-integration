SysMLv2-AAS Transformation
This repository provides a model transformation from SysMLv2 models to Asset Administration Shell (AAS) structures. The aim is to align systems engineering models with the digital twin ecosystem in Industry 4.0.

💡 Overview
This tool supports:

Parsing SysMLv2 model artifacts

Mapping model elements to AAS submodels

Producing AAS-compliant output for use in digital twin systems

📁 Repository Structure
MDE artifact model update/ – Contains transformation logic and related artifacts

models/ – Sample SysMLv2 input models

.DS_Store – System-generated file (can be ignored)

README.md – Project documentation

⚙️ Requirements
Java 11 or higher

Gradle (or use the provided Gradle wrapper)

(Optional) Eclipse IDE with Xtend support, for development purposes

🚀 Getting Started
bash
git clone https://github.com/jku-win-se/sysmlv2-aas-transformation.git
cd sysmlv2-aas-transformation
./gradlew build
> 🚧 Usage instructions for running the transformation will be added in upcoming updates.

🤝 Contributions
Contributions are welcome! Fork the repository and submit a pull request. If you're planning a major change, open an issue first to discuss it.

📝 License
Licensed under the MIT License. Please see the LICENSE file for full details.

