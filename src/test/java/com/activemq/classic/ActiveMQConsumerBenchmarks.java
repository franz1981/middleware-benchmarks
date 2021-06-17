package com.activemq.classic;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import com.gocypher.cybench.core.annotation.BenchmarkMetaData;

@State(Scope.Benchmark)
@BenchmarkMetaData(key = "isLibraryBenchmark", value = "true")
@BenchmarkMetaData(key = "context", value = "ReceiveMsg")
@BenchmarkMetaData(key = "domain", value = "java")
@BenchmarkMetaData(key = "version", value = "1.0.0")
@BenchmarkMetaData(key = "description", value = "Middleware helps to deliver and track messages between systems")
public class ActiveMQConsumerBenchmarks {
	private ActiveMQConsumer myConsumer;

	@Param({ "512", "1024", "10240", "32768", "65536" })
	private String messageSize;

	@Param({ "10000", "100000", "1000000" })
	private int totalConsumedMessages;

	@Setup(Level.Trial)
	public void setup() {
	}

	@Setup(Level.Iteration)
	public void setupIteration() {
		myConsumer = new ActiveMQConsumer(messageSize);
	}

	@Benchmark
	@BenchmarkMetaData(key = "api", value = "ActiveMQ Classic")
	@BenchmarkMetaData(key = "libVendor", value = "Apache")
	@BenchmarkMetaData(key = "libUrl", value = "https://activemq.apache.org/components/classic/")
	@BenchmarkMetaData(key = "libVersion", value = "5.16.2")
	@BenchmarkMetaData(key = "libDescription", value = "High-performance, non-blocking architecture for the next generation of messaging applications.")
	@BenchmarkMetaData(key = "actionName", value = "consume")
	@BenchmarkMetaData(key = "libSymbolicName", value = "org.apache.activemq.all")
	@BenchmarkMetaData(key = "title", value = "Receiving messages")
	@BenchmarkMode(Mode.Throughput)
	@OutputTimeUnit(TimeUnit.SECONDS)
	@Fork(1)
	@Threads(1)
	@Measurement(iterations = 1, time = 100, timeUnit = TimeUnit.MILLISECONDS)
	@Warmup(iterations = 0, time = 100, timeUnit = TimeUnit.MILLISECONDS)
	public void consumeBenchmark(Blackhole bh) throws Exception {
		myConsumer.consume(totalConsumedMessages);
	}

	@TearDown(Level.Trial)
	public void tearDown() {
	}

	@TearDown(Level.Iteration)
	public void tearDownIteration() {
		myConsumer.closeConnection();
	}

}