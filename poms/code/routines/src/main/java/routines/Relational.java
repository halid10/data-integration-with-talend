// ============================================================================
//
// Copyright (c) 2006-2014, Talend SA.
//
// Ce code source a été automatiquement généré par_Talend Cloud Data Fabric
// CodeGenerator version 8.0.1.20220923_1236-patch
// Vous pouvez trouver plus d'informations sur les produits Talend sur www.talend.com.
// Vous pouvez distribuer ce code sous les termes de la licence GNU LGPL
// (http://www.gnu.org/licenses/lgpl.html).
//
// ============================================================================
package routines;

public class Relational {

    /**
     * Indicates when a variable is the null value.
     *
     * {talendTypes} boolean | Boolean
     *
     * {Category} Relational
     *
     * {param} Object(null)
     *
     * {example} ISNULL(null)
     *
     *
     */
    public static boolean ISNULL(Object variable) {
        return variable == null;
    }

    /**
     * Returns the complement of the logical value of an expression.
     *
     * {talendTypes} boolean | Boolean
     *
     * {Category} Relational
     *
     * {param} boolean(true)
     *
     * {example} NOT(false)
     */
    public static boolean NOT(boolean expression) {
        return !expression;
    }
    
    /**
     * Indicates when a variable is the null value.
     * 
     * @param value :the object need to judge.
     * 
     * @return 1 if value == null, 0 if not.
     * 
     * {Category} Relational
     * 
     * {param} Object(null)
     * 
     * {example} ISNULL(null)
     */
	public static int isNull(Object value) {
		if (value == null) {
			return 1;
		}
		return 0;

	}
}
