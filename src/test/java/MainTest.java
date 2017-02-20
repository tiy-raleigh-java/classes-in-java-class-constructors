import net.doughughes.testifier.exception.CannotFindMethodException;
import net.doughughes.testifier.matcher.RegexMatcher;
import net.doughughes.testifier.test.TestifierTest;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class MainTest extends TestifierTest {

    @Test
    public void mainMethodShouldInstantiateAWizardTest() {
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The main() method should instantiate a new Character of with a type of 'wizard' and set it into a variable named wizard.",
                source, RegexMatcher.matches("^.*?ExpressionStmt VariableDeclarationExpr ReferenceType ClassOrInterfaceType\\[Character\\] VariableDeclarator VariableDeclaratorId\\[wizard\\] ObjectCreationExpr ClassOrInterfaceType\\[Character\\] StringLiteralExpr\\[.*?\\] StringLiteralExpr\\[wizard\\].*?\\/ExpressionStmt.*?$"));
    }

    @Test
    public void mainMethodShouldInstantiateAnOrcTest() {
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("^.*?ExpressionStmt VariableDeclarationExpr ReferenceType ClassOrInterfaceType\\[Character\\] VariableDeclarator VariableDeclaratorId\\[orc\\] ObjectCreationExpr ClassOrInterfaceType\\[Character\\] StringLiteralExpr\\[.*?\\] StringLiteralExpr\\[orc\\].*?\\/ExpressionStmt.*?$",
                source, RegexMatcher.matches("^.*?ExpressionStmt VariableDeclarationExpr ReferenceType ClassOrInterfaceType\\[Character\\] VariableDeclarator VariableDeclaratorId\\[orc\\] ObjectCreationExpr ClassOrInterfaceType\\[Character\\] StringLiteralExpr\\[.*?\\] StringLiteralExpr\\[orc\\].*?\\/ExpressionStmt.*?$"));
    }

    @Test
    public void mainMethodShouldOutputWizardDescriptionAfterInstantiatingIt(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The main() method should print a description of the wizard after instantiating it.",
                source, RegexMatcher.matches("^.*?ExpressionStmt VariableDeclarationExpr ReferenceType ClassOrInterfaceType\\[Character\\] VariableDeclarator VariableDeclaratorId\\[wizard\\].*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments NameExpr\\[wizard\\] \\/MethodArguments \\/MethodCallExpr \\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldOutputOrcDescriptionAfterInstantiatingIt(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The main() method should print a description of the orc after instantiating it.",
                source, RegexMatcher.matches("^.*?ExpressionStmt VariableDeclarationExpr ReferenceType ClassOrInterfaceType\\[Character\\] VariableDeclarator VariableDeclaratorId\\[orc\\].*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments NameExpr\\[orc\\] \\/MethodArguments \\/MethodCallExpr \\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldHaveWizardAttackOrcTest(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The wizard should attack the orc.",
                source, RegexMatcher.matches("^.*?ExpressionStmt MethodCallExpr NameExpr\\[wizard\\] MethodName\\[attack\\] MethodArguments NameExpr\\[orc\\] \\/MethodArguments \\/MethodCallExpr \\/ExpressionStmt.*?$"));
    }

    @Test
    public void mainMethodShouldHaveOrcAttackWizardTest(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The orc should attack the wizard.",
                source, RegexMatcher.matches("^.*?ExpressionStmt MethodCallExpr NameExpr\\[orc\\] MethodName\\[attack\\] MethodArguments NameExpr\\[wizard\\] \\/MethodArguments \\/MethodCallExpr \\/ExpressionStmt.*?$"));
    }

    @Test
    public void mainMethodShouldOutputWizardDescriptionsAfterAttackingTest(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The main() method should print a description of the wizard before any attacks.",
                source, RegexMatcher.matches("^.*?ExpressionStmt MethodCallExpr NameExpr\\[wizard\\] MethodName\\[attack\\].*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments NameExpr\\[wizard\\] \\/MethodArguments \\/MethodCallExpr \\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldOutputOrcDescriptionsAfterAttackingTest(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The main() method should print a description of the orc before any attacks.",
                source, RegexMatcher.matches("^.*?ExpressionStmt MethodCallExpr NameExpr\\[orc\\] MethodName\\[attack\\].*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments NameExpr\\[orc\\] \\/MethodArguments \\/MethodCallExpr \\/ExpressionStmt.*?$"));

    }
}