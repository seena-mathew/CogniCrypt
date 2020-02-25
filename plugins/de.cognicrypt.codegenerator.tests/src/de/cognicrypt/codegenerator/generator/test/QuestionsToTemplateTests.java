package de.cognicrypt.codegenerator.generator.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import de.cognicrypt.codegenerator.question.Answer;
import de.cognicrypt.codegenerator.question.Question;
import de.cognicrypt.codegenerator.tasks.Task;
import de.cognicrypt.codegenerator.testutilities.TestUtils;
import de.cognicrypt.codegenerator.wizard.AltConfigWizard;
import java.util.HashMap;

/**
 * The JUnit Plug-in tests check the correctness of CogniCrypt's code generation feature
 * in determining the template path when the user chooses an arbitrary task and a set of 
 * given question-answers in the wizard dialog. This is important since the code generation
 * depends on the computed path to generate the proper template for a given input from
 * the user through CogniCrypt's wizard.
 * 
 * @author Shahrzad Asghari
 * @author Enri Ozuni
 */
public class QuestionsToTemplateTests {
	
	@Test
	public void testEncryptionTaskWithEncryptedDigitalChannelAndByteArray() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
		Answer question1answer1 = new Answer();
		question1answer1.setValue("Encrypted digital channel");
		question1answer1.setOption("");
		Answer question2answer1 = new Answer();
		question2answer1.setValue("Byte Array");
		question2answer1.setOption("");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer1);
		constraints.put(question2, question2answer1);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryption";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithEncryptedDigitalChannelAndFile() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
		Answer question1answer1 = new Answer();
		question1answer1.setValue("Encrypted digital channel");
		question1answer1.setOption("");
		Answer question2answer2 = new Answer();
		question2answer2.setValue("File");
		question2answer2.setOption("files");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer1);
		constraints.put(question2, question2answer2);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionfiles";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithEncryptedDigitalChannelAndString() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
		Answer question1answer1 = new Answer();
		question1answer1.setValue("Encrypted digital channel");
		question1answer1.setOption("");
		Answer question2answer3 = new Answer();
		question2answer3.setValue("String");
		question2answer3.setOption("strings");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer1);
		constraints.put(question2, question2answer3);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionstrings";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithEncryptedDigitalChannelAndOther() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
		Answer question1answer1 = new Answer();
		question1answer1.setValue("Encrypted digital channel");
		question1answer1.setOption("");
		Answer question2answer4 = new Answer();
		question2answer4.setValue("Other/Do not know");
		question2answer4.setOption("");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer1);
		constraints.put(question2, question2answer4);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryption";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithEncryptedHardDriveAndByteArray() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
		Answer question1answer2 = new Answer();
		question1answer2.setValue("Encrypted Hard Drive");
		question1answer2.setOption("");
		Answer question2answer1 = new Answer();
		question2answer1.setValue("Byte Array");
		question2answer1.setOption("");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer2);
		constraints.put(question2, question2answer1);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryption";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithEncryptedHardDriveAndFile() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer2 = new Answer();
		question1answer2.setValue("Encrypted Hard Drive");
		question1answer2.setOption("");
		Answer question2answer2 = new Answer();
		question2answer2.setValue("File");
		question2answer2.setOption("files");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer2);
		constraints.put(question2, question2answer2);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionfiles";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithEncryptedHardDriveAndString() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer2 = new Answer();
		question1answer2.setValue("Encrypted Hard Drive");
		question1answer2.setOption("");
		Answer question2answer3 = new Answer();
		question2answer3.setValue("String");
		question2answer3.setOption("strings");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer2);
		constraints.put(question2, question2answer3);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionstrings";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithEncryptedHardDriveAndOther() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer2 = new Answer();
		question1answer2.setValue("Encrypted Hard Drive");
		question1answer2.setOption("");
		Answer question2answer4 = new Answer();
		question2answer4.setValue("Other/Do not know");
		question2answer4.setOption("");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer2);
		constraints.put(question2, question2answer4);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryption";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithUnencryptedDigitalChannelAndByteArray() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
		Answer question1answer3 = new Answer();
		question1answer3.setValue("Unencrypted digital channel (e.g. email)");
		question1answer3.setOption("hybrid");
		Answer question2answer1 = new Answer();
		question2answer1.setValue("Byte Array");
		question2answer1.setOption("");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer3);
		constraints.put(question2, question2answer1);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionhybrid";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithUnencryptedDigitalChannelAndFile() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer3 = new Answer();
		question1answer3.setValue("Unencrypted digital channel (e.g. email)");
		question1answer3.setOption("hybrid");
		Answer question2answer2 = new Answer();
		question2answer2.setValue("File");
		question2answer2.setOption("files");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer3);
		constraints.put(question2, question2answer2);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionhybridfiles";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithUnencryptedDigitalChannelAndString() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer3 = new Answer();
		question1answer3.setValue("Unencrypted digital channel (e.g. email)");
		question1answer3.setOption("hybrid");
		Answer question2answer3 = new Answer();
		question2answer3.setValue("String");
		question2answer3.setOption("strings");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer3);
		constraints.put(question2, question2answer3);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionhybridstrings";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithUnencryptedDigitalChannelAndOther() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer3 = new Answer();
		question1answer3.setValue("Unencrypted digital channel (e.g. email)");
		question1answer3.setOption("hybrid");
		Answer question2answer4 = new Answer();
		question2answer4.setValue("Other/Do not know");
		question2answer4.setOption("");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer3);
		constraints.put(question2, question2answer4);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionhybrid";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithUnencryptedAnalogChannelAndByteArray() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
		Answer question1answer4 = new Answer();
		question1answer4.setValue("Unencrypted analog channel (e.g. phone, mail)");
		question1answer4.setOption("");
		Answer question2answer1 = new Answer();
		question2answer1.setValue("Byte Array");
		question2answer1.setOption("");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer4);
		constraints.put(question2, question2answer1);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryption";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithUnencryptedAnalogChannelAndFile() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer4 = new Answer();
		question1answer4.setValue("Unencrypted analog channel (e.g. phone, mail)");
		question1answer4.setOption("");
		Answer question2answer2 = new Answer();
		question2answer2.setValue("File");
		question2answer2.setOption("files");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer4);
		constraints.put(question2, question2answer2);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionfiles";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithUnencryptedAnalogChannelAndString() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer4 = new Answer();
		question1answer4.setValue("Unencrypted analog channel (e.g. phone, mail)");
		question1answer4.setOption("");
		Answer question2answer3 = new Answer();
		question2answer3.setValue("String");
		question2answer3.setOption("strings");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer4);
		constraints.put(question2, question2answer3);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionstrings";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithUnencryptedAnalogChannelAndOther() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer4 = new Answer();
		question1answer4.setValue("Unencrypted analog channel (e.g. phone, mail)");
		question1answer4.setOption("");
		Answer question2answer4 = new Answer();
		question2answer4.setValue("Other/Do not know");
		question2answer4.setOption("");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer4);
		constraints.put(question2, question2answer4);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryption";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithNoSharingAndByteArray() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
		Answer question1answer5 = new Answer();
		question1answer5.setValue("No Sharing");
		question1answer5.setOption("");
		Answer question2answer1 = new Answer();
		question2answer1.setValue("Byte Array");
		question2answer1.setOption("");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer5);
		constraints.put(question2, question2answer1);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryption";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithNoSharingAndFile() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer5 = new Answer();
		question1answer5.setValue("No Sharing");
		question1answer5.setOption("");
		Answer question2answer2 = new Answer();
		question2answer2.setValue("File");
		question2answer2.setOption("files");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer5);
		constraints.put(question2, question2answer2);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionfiles";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithNoSharingAndString() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer5 = new Answer();
		question1answer5.setValue("No Sharing");
		question1answer5.setOption("");
		Answer question2answer3 = new Answer();
		question2answer3.setValue("String");
		question2answer3.setOption("strings");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer5);
		constraints.put(question2, question2answer3);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryptionstrings";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testEncryptionTaskWithNoSharingAndOther() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task encryption = TestUtils.getTask("Encryption");
		wizard.setSelectedTask(encryption);
		Question question1 = new Question();
		question1.setId(0);
        question1.setQuestionText("Which method of communication would you prefer to use for key exchange?");
		Question question2 = new Question();
		question2.setId(1);
        question2.setQuestionText("What data type do you wish to encrypt?");
        Answer question1answer5 = new Answer();
		question1answer5.setValue("No Sharing");
		question1answer5.setOption("");
		Answer question2answer4 = new Answer();
		question2answer4.setValue("Other/Do not know");
		question2answer4.setOption("");
		HashMap<Question, Answer> constraints = new HashMap<Question, Answer>();
		constraints.put(question1, question1answer5);
		constraints.put(question2, question2answer4);
		wizard.constructConstraints(constraints);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/encryption";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testSecurePasswordTask() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task securepassword = TestUtils.getTask("SecurePassword");
		wizard.setSelectedTask(securepassword);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/securepassword";
		assertEquals(expected, wizard.constructTemplateName());
	}
	
	@Test
	public void testDigitalSignaturesTask() {
		AltConfigWizard wizard = new AltConfigWizard();
		Task digitalsignatures = TestUtils.getTask("DigitalSignatures");
		wizard.setSelectedTask(digitalsignatures);
		String expected = "src/main/java/de/cognicrypt/codegenerator/crysl/templates/digitalsignatures";
		assertEquals(expected, wizard.constructTemplateName());
	}
}