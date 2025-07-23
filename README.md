# sysmlv2-aas-transformation

## What is Included

### Model-Driven Engineering Artifacts
- AAS Metamodel  
- SysML Metamodel  
- SysML v2 Test Suite  
- AAS Expected Models  
- Qvto Transformation  

### Descriptive Artifacts
- SysML v2 Specification  
- AAS Specification  

---

## Installation Requirements

To run the implementation, we suggest you install the following:

- Java SE 11  
- Eclipse Version: 2021-03 (4.19)  
- QVTo Plugin: [https://projects.eclipse.org/projects/modeling.mmt.qvt-oml/downloads](https://projects.eclipse.org/projects/modeling.mmt.qvt-oml/downloads)

---

## Installation Details

1. Import the **AAS Metamodel** and **SysML v2 Metamodel** files into your Eclipse workspace.  
2. Launch a **new Eclipse instance**.  
3. Import the **QVTo Transformation** and **SysML v2 Test Suite** into the new instance.  
4. Run the **QVTo Transformation** on one of the models from the SysML v2 Test Suite folder as the source model.  
   - Example:  
     `platform:/resource/sysml/src/training/01.package/Package Example.sysml`