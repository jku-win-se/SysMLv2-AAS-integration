/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.SubmodelElementCollection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submodel Element Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.SubmodelElementCollectionImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link AAS.impl.SubmodelElementCollectionImpl#isAllowDuplicates <em>Allow Duplicates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmodelElementCollectionImpl extends ComposableElementImpl implements SubmodelElementCollection {
	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_DUPLICATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDuplicates()
	 * @generated
	 * @ordered
	 */
	protected boolean allowDuplicates = ALLOW_DUPLICATES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmodelElementCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.SUBMODEL_ELEMENT_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT_COLLECTION__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowDuplicates() {
		return allowDuplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowDuplicates(boolean newAllowDuplicates) {
		boolean oldAllowDuplicates = allowDuplicates;
		allowDuplicates = newAllowDuplicates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES, oldAllowDuplicates, allowDuplicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AASPackage.SUBMODEL_ELEMENT_COLLECTION__ORDERED:
				return isOrdered();
			case AASPackage.SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES:
				return isAllowDuplicates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AASPackage.SUBMODEL_ELEMENT_COLLECTION__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case AASPackage.SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES:
				setAllowDuplicates((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AASPackage.SUBMODEL_ELEMENT_COLLECTION__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case AASPackage.SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES:
				setAllowDuplicates(ALLOW_DUPLICATES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AASPackage.SUBMODEL_ELEMENT_COLLECTION__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case AASPackage.SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES:
				return allowDuplicates != ALLOW_DUPLICATES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ordered: ");
		result.append(ordered);
		result.append(", allowDuplicates: ");
		result.append(allowDuplicates);
		result.append(')');
		return result.toString();
	}

} //SubmodelElementCollectionImpl
