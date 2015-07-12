package test;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import steps.SearchSteps;


public class runStory extends JUnitStories {

	public runStory() {
		configuredEmbedder().
		embedderControls().
		doGenerateViewAfterStories(true).
		doIgnoreFailureInStories(false).
		doIgnoreFailureInView(true).
		doVerboseFailures(true);
	}

	@Override
	public Configuration configuration() {
		Properties viewResources = new Properties();
		viewResources.put("decorateNonHtml", "true");
		return new MostUsefulConfiguration().
											useStoryReporterBuilder(new StoryReporterBuilder().
											withFormats(Format.CONSOLE, Format.HTML_TEMPLATE, Format.XML).withDefaultFormats());
	}

	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), new SearchSteps());
	}

	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("story/openGooglePage.story");
	}

}
