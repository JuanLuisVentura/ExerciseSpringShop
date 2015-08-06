<jsp:include page="header.jsp"></jsp:include>

	<% if (false) { %>
      <form class="form-signin">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
      <% } else { %>
      	<div class="input-group input-group-sm">
		  <span class="input-group-addon" id="sizing-addon">User</span>
		  <input type="text" class="form-control" placeholder="Username" aria-describedby="sizing-addon3">
		  
		  <span class="input-group-addon" id="sizing-addon">Password</span>
		  <input type="text" class="form-control" placeholder="Password" aria-describedby="sizing-addon3">
		</div>
      <% } %>

<jsp:include page="footer.jsp"></jsp:include>    