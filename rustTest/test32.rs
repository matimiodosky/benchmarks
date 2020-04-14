use std::time::{Duration, Instant};
use std::f32;



fn main() {
  
  let f = f32::consts::FRAC_PI_4;
  let start = Instant::now();
  let mut a  = 0;
  for x in 0..55000000 {
     a = 1000 * 1000;
  }
  for x in 0..1000000 {
     let b = f.acos();
  }

  let duration = start.elapsed();
  println!("Time elapsed in expensive_function() is: {:?}", duration);
}
