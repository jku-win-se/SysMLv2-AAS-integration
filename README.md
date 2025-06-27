# 🔗 SysMLv2–AAS Integration

**SysMLv2–AAS Integration** bridges the gap between systems modeling and Industry 4.0 by transforming SysMLv2 models into Asset Administration Shell (AAS) representations. This integration enables digital twins to seamlessly ingest and leverage engineering designs modeled with SysMLv2.

---

## ✨ Key Features

- 🔄 Converts SysMLv2 models into AAS submodels
- 🧩 Modular transformation pipeline based on [Eclipse EMF](https://www.eclipse.org/modeling/emf/)
- ⚙️ Includes an [Ecore-based metamodel](https://wiki.eclipse.org/Ecore) representing AAS elements
- 🔧 Implements model transformation logic in [QVTo (QVT Operational)](https://www.eclipse.org/mmt/qvto/)
- 📦 Clean output compatible with Industry 4.0 digital twin infrastructures
- 🧪 Sample SysMLv2 models included for experimentation

---

## 🗂️ Project Structure

```text
├── MDE artifact model update/   # Transformation logic (QVTo) and Ecore models
├── models/                      # Example SysMLv2 input models
├── .gitignore                   # Ignore rules
└── README.md                    # Project documentation (this file)
